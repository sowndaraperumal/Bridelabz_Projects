import { Component, OnInit, Input, Inject } from '@angular/core';
import { CreateNoteModel } from 'src/app/Model/add-notes.model';
import { MatDialog, MatDialogRef, MAT_DIALOG_DATA, MatSnackBar } from '@angular/material';
import { NoteServiceService } from 'src/app/Service/note-service.service';
import { CardsupdateServiceService } from 'src/app/Service/cardsupdate-service.service';

@Component({
  selector: 'app-edit-dailog-bar',
  templateUrl: './edit-dailog-bar.component.html',
  styleUrls: ['./edit-dailog-bar.component.css']
})
export class EditDailogBarComponent implements OnInit {

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
  constructor(private noteservice:NoteServiceService,private cardupdate:CardsupdateServiceService,private snackBar: MatSnackBar,public dialogRef:MatDialogRef<EditDailogBarComponent>,
    @Inject(MAT_DIALOG_DATA) public noteDetail:any ) {



   }

  ngOnInit() {
    if(this.noteDetail.archive==0){
      this.archiveView=true;
     
      }else{
          this.unarchiveView=true;
      }
     
  }
  archive(){
    //this.createnote.archive=1;
    
   // console.log(this.noteDetail.archive,'archive   ','noteid',this.noteDetail.noteId);
    
    this.noteservice.updateArchiveNote(this.noteDetail).subscribe(

        response =>{
           
            if(response.statusCode==166)
            {
          
         // this.archiveNote.ngOnInit();
         console.log("sowndar");
         
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
  changeColor(color) {

    this.noteDetail.color = color;
    this.noteservice.updateColorNote(this.noteDetail).subscribe(
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

  saveEditedNote(data){
    console.log('dd');
    
console.log(data);


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
}
