import { Component, OnInit } from '@angular/core';
import { CreateNoteModel } from 'src/app/Model/add-notes.model';
import { CardsupdateServiceService } from 'src/app/Service/cardsupdate-service.service';
import { NoteServiceService } from 'src/app/Service/note-service.service';

@Component({
  selector: 'app-trash',
  templateUrl: './trash.component.html',
  styleUrls: ['./trash.component.css']
})
export class TrashComponent implements OnInit {
  private  allnotes:CreateNoteModel[];

  constructor(private cardupdate:CardsupdateServiceService,private notecrudservice:NoteServiceService) {}

  ngOnInit() {
    this.cardupdate.currentnotes.subscribe(udnotes=>
      this.allnotes=udnotes);
  }

}
