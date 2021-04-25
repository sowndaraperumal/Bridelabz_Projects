import { Component, OnInit } from '@angular/core';
import { CreateNoteModel } from 'src/app/Model/add-notes.model';
import { CardsupdateServiceService } from 'src/app/Service/cardsupdate-service.service';
import { NoteServiceService } from 'src/app/Service/note-service.service';
import { ArchiveComponent } from '../archive/archive.component';

@Component({
  selector: 'app-current-notes',
  templateUrl: './current-notes.component.html',
  styleUrls: ['./current-notes.component.css']
})
export class CurrentNotesComponent implements OnInit {

  private  allnotes:CreateNoteModel[];
  private  archivenote :CreateNoteModel[];
  showtoolbar=false;
  constructor(private cardupdate:CardsupdateServiceService,private notecrudservice:NoteServiceService) {}

    ngOnInit() {
    
       this.cardupdate.currentnotes.subscribe(udnotes=>
        this.allnotes=udnotes);
     

        

        
      // this.cardupdate.archivenotes.subscribe(udnotes=>
      //   this.archivenote=udnotes);
  }

 

}
