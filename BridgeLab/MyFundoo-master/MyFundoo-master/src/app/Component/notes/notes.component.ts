import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';


import {MatSnackBar} from '@angular/material';
import {MatDialog} from '@angular/material';
import { ArchiveComponent } from '../archive/archive.component';
import { AddNoteComponent } from '../add-note/add-note.component';
import { CreateNoteModel } from 'src/app/Model/add-notes.model';
import { NoteServiceService } from 'src/app/Service/note-service.service';
import { CardsupdateServiceService } from 'src/app/Service/cardsupdate-service.service';
import { EditDailogBarComponent } from '../edit-dailog-bar/edit-dailog-bar.component';
import { BehaviorSubject } from 'rxjs';


@Component({
selector: 'app-notes',

templateUrl: './notes.component.html',
styleUrls: ['./notes.component.css']
})
export class NotesComponent implements OnInit {

createnote:CreateNoteModel=new CreateNoteModel;
archiveView:boolean=false;
unarchiveView:boolean=false;
colorCode: Array<Object> = [
    { name: "white", colorCode: "rgb(255, 255, 255)" },
    { name: "lightGreen", colorCode: "rgb(204, 255, 144)" },
    { name: "purple", colorCode: "rgb(215, 174, 251)" },
    { name: "red", colorCode: "rgb(242, 139, 130)" },
    { name: "Teal", colorCode: "rgb(167, 255, 235)" },
    { name: "pink", colorCode: "rgb(253, 207, 232)" },
    { name: "orange", colorCode: "rgb(251, 188, 4)" },
    { name: "blue", colorCode: "rgb(203, 240, 248)" },
    { name: "brown", colorCode: "rgb(230, 201, 168)" },
    { name: "yellow", colorCode: "rgb(255, 244, 117)" },
    { name: "darkBlue", colorCode: "rgb(174, 203, 250)" },
    { name: "gray", colorCode: "rgb(232, 234, 237)" }
  ]
  color:string;
constructor(private noteservice:NoteServiceService,private cardupdate:CardsupdateServiceService,private snackBar: MatSnackBar,private dialog: MatDialog,private notecrud:NoteServiceService) {
var arr_names:string[] = new Array();
}
@Input() noteDetail:CreateNoteModel;
private  allnotes:CreateNoteModel[];
@Output() messageEvent = new EventEmitter<String>();


ngOnInit() {
 

 if(this.noteDetail.archive==false){
 this.archiveView=true;

 }else{
     this.unarchiveView=true;
 }

 //console.log(this.noteDetail.archive,'hello');

  //console.log('hello');
  
//   this.noteservice.getnotes().subscribe(

//      response=> {
//             this.allnotes=response;
//              if(this.allnotes.length != 0)
//         {
        
//         }
//       }
//  )

//this.cardupdate.changemessage();


}
changeColor(color) {

    this.noteDetail.color = color;
    this.noteservice.updateEditNote(this.noteDetail).subscribe(
        response => {
        if(response.statusCode==166)
        {
        this.snackBar.open(response.statusMessage,"changed to 1",{
        duration:2000,
        })
        this.cardupdate.changemessage();
        }
        },
        error =>{
        console.log("Error",error);
        } 
        );




  }



openEditDialog(noteDetail) {
    const dialogRef = this.dialog.open(EditDailogBarComponent, {
      data: noteDetail,
      panelClass: 'my-class'
    });

    dialogRef.afterClosed().subscribe(result => {
    console.log(noteDetail);

      

this.noteservice.updateEditNote(this.noteDetail).subscribe(
  response => {
  if(response.statusCode==166)
  {
  this.snackBar.open(response.statusMessage,"changed to 1",{
  duration:2000,
  })
  this.cardupdate.changemessage();
  }
  },
  error =>{
  console.log("Error",error);
  } 
  );
    });

  }
noteDelete()
{
console.log(this.noteDetail);
this.noteservice.updaterestoreNote(this.noteDetail).subscribe(
response => {
if(response.statusCode==166)
{
this.snackBar.open(response.statusMessage,"changed to 1",{
duration:2000,
})
this.cardupdate.changemessage();
}
},
error =>{
console.log("Error",error);
} 
);

}



archive(){
  
    this.noteservice.updateArchiveNote(this.noteDetail).subscribe(

        response =>{
           
            if(response.statusCode==166)
            {
          
         // this.archiveNote.ngOnInit();
this.cardupdate.changemessage();
           this.snackBar.open(response.statusMessage,"added",{
            duration:2000,
            })
            }
           
            },
            error =>{
            console.log("Error",error);
            } 
            );
   
            


}


pinChange(){
  
  this.noteservice.updatePinNote(this.noteDetail).subscribe(

      response =>{
         
          if(response.statusCode==166)
          {
        
       // this.archiveNote.ngOnInit();
this.cardupdate.changemessage();
         this.snackBar.open(response.statusMessage,"added",{
          duration:2000,
          })
          }
         
          },
          error =>{
          console.log("Error",error);
          } 
          );
 
          


}

}
