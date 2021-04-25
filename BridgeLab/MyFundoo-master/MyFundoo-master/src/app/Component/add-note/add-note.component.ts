import { Component, OnInit } from '@angular/core';

import {MatSnackBar, throwMatDialogContentAlreadyAttachedError} from '@angular/material';
import { isArray, isNull, isNullOrUndefined } from 'util';


import { NoteServiceService } from 'src/app/Service/note-service.service';
import { CreateNoteModel } from 'src/app/Model/add-notes.model';
import { CardsupdateServiceService } from 'src/app/Service/cardsupdate-service.service';

@Component({
  selector: 'app-add-note',
  templateUrl: './add-note.component.html',
  styleUrls: ['./add-note.component.css']
  })
  export class AddNoteComponent implements OnInit {
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
    pinnedIconSrc = "../../assets/pin.svg";
    unpinnedIconSrc = "../../assets/Icons/unpin.svg";
    showaddlabel:boolean=false;
  isOpen:boolean=false;
  showicon:boolean=true;
  getnote:boolean=false;
  createnote:CreateNoteModel=new CreateNoteModel;
  pin:boolean=false;
  newnote:CreateNoteModel=new CreateNoteModel();
  getnewnote:boolean=false;
  color:string;
  show:boolean=false;
  showlabel:boolean=false;
  constructor(private noteservice:NoteServiceService,private snackBar: MatSnackBar,private cardupdate:CardsupdateServiceService) { }
  text:'entre a label ';
  getnotes:boolean=false;
  private  allnotes:CreateNoteModel[];
 
  public ngOnInit(){
   
  }
  changelabel(){
    console.log("add ");
    
this.showaddlabel=!this.showaddlabel;
  }
  
  archive(){
    this.isOpen=false;
    console.log("archived");
    


this.createnote.color=this.color;

    
  
//console.log(this.createnote,'ssds')
if(this.createnote.title !=null){
  this.createnote.archive=true;
this.noteservice.createNote(this.createnote).subscribe(
response =>{


if(response.statusCode==166)
{
  this.createnote.color="white";

this.snackBar.open(response.statusMessage,"added",{
duration:2000,
})
}
this.cardupdate.changemessage();
},

error =>{
console.log("Error",error);
} 
);
this.newnote=this.createnote;

this.createnote=new CreateNoteModel();

}



  }
 
  insertName(e){
    this.text=e.target.value;
    console.log(e.target.value);
  }





  changeColor(color) {

    this.color = color;

  }

  pinChange(){


    this.pin=true;
    console.log(this.pin);
    
  }

  showView(){
console.log('place');

this.show=!this.show;

this.showlabel=false;
  }
  

  showLabel(){
    this.show=!this.show;
    this.showlabel=true;

  }
  noteSave()
  {
 
    this.show=!this.show;
    
    if(this.show ){
    this.show=false;
  
  }
  if(this.showLabel ){
    this.showlabel=false;
  
  }

    this.getnote =true;
    
this.isOpen=false;

    console.log(this.createnote.archive);
  




  //console.log(this.createnote,'ssds')
  if(this.createnote.title !=null){
    

    this.createnote.color=this.color;

    this.createnote.pinned=this.pin;
    console.log(this.createnote);
    
console.log(this.createnote.pinned);

  this.noteservice.createNote(this.createnote).subscribe(
  response =>{ this.showicon=false;
 
  if(response.statusCode==166)
  {
this.ngOnInit();
  this.snackBar.open(response.statusMessage,"added",{
  duration:2000,
  })
  }
  this.cardupdate.changemessage();
  },
  error =>{
  console.log("Error",error);
  } 
  );
this.newnote=this.createnote;

this.createnote=new CreateNoteModel();this.color="white";

}
  // console.log(this.createnote.title);
  // console.log(this.createnote.description);
 
  }
  
  }
