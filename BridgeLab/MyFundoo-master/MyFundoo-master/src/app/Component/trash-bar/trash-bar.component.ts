import { Component, OnInit, Input } from '@angular/core';
import { CreateNoteModel } from 'src/app/Model/add-notes.model';
import { CardsupdateServiceService } from 'src/app/Service/cardsupdate-service.service';
import { NoteServiceService } from 'src/app/Service/note-service.service';
import { MatSnackBar } from '@angular/material';

@Component({
  selector: 'app-trash-bar',
  templateUrl: './trash-bar.component.html',
  styleUrls: ['./trash-bar.component.css']
})
export class TrashBarComponent implements OnInit {
  private  allnotes:CreateNoteModel[];
  @Input() noteDetail:CreateNoteModel;
  constructor(private snackBar: MatSnackBar,private cardupdate:CardsupdateServiceService,private noteservice:NoteServiceService) { }

  ngOnInit() {

  }

  restorenote(){

 
    this.noteservice.updaterestoreNote(this.noteDetail).subscribe(

      response =>{
         
          if(response.statusCode==166)
          {
        
       // this.archiveNote.ngOnInit();
this.cardupdate.changemessage();
         this.snackBar.open(response.statusMessage,"note in bin folder",{
          duration:2000,
          })
          }
         
          },
          error =>{
          console.log("Error",error);
          } 
          );
 
          
        }



          noteDelete(){

 console.log(this.noteDetail);
 
            this.noteservice.noteDelete(this.noteDetail).subscribe(
        
              response =>{
                 
                  if(response.statusCode==166)
                  {
                
               // this.archiveNote.ngOnInit();
        this.cardupdate.changemessage();
                 this.snackBar.open(response.statusMessage,"note deletede permanently",{
                  duration:2000,
                  })
                  }
                 
                  },
                  error =>{
                  console.log("Error",error);
                  } 
                  );
         
                  

                }}






  






