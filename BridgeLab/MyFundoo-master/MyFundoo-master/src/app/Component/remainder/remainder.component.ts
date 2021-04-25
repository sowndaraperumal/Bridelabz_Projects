import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material';
import { NoteServiceService } from 'src/app/Service/note-service.service';
import { CreateNoteModel } from 'src/app/Model/add-notes.model';


@Component({
  selector: 'app-remainder',
  templateUrl: './remainder.component.html',
  styleUrls: ['./remainder.component.css']
})
export class RemainderComponent implements OnInit {

 
  barshow:boolean=false;
  showicon:boolean=true;
  createnote:CreateNoteModel=new CreateNoteModel;
  constructor(private noteservice:NoteServiceService,private snackBar: MatSnackBar) { }
  
  
  fullCardShow()
  {
  this.barshow=!this.barshow;
 
  }
  ngOnInit() {
  }
  
  noteSave()
  {
    this.showicon=!this.showicon;
  this.barshow=!this.barshow;
  this.createnote.pinned=true;
  
  this.noteservice.createNote(this.createnote).subscribe(
  response =>{
  if(response.statusCode==166)
  {
  this.snackBar.open(response.statusMessage,"",{
  duration:2000,
  })
  }
  
  },
  error =>{
  console.log("Error",error);
  } 
  );
  console.log(this.createnote.title);
  console.log(this.createnote.description);
  }
  
  }


