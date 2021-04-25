import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';
import { NoteServiceService } from './note-service.service';

@Injectable({
  providedIn: 'root'
})
export class CardsupdateServiceService {

  private allNotes=new BehaviorSubject([]);
  private archivenote=new BehaviorSubject([])
  currentnotes=this.allNotes.asObservable();
archivenotes=this.archivenote.asObservable();
  constructor(private notecrud:NoteServiceService) {
    
    this.notecrud.getnotes().subscribe(
      response =>{
        this.allNotes.next(response);
      },
      error=>
      {
        console.log(error);
      }
    );
    
   }

   ngOnInit():void {
    
   }
   
  changemessage()
  {
    this.notecrud.getnotes().subscribe(
      response=>{
  
        this.allNotes.next(response);
      },
      error =>{  
       console.log(error);
      }
    );
         

}


}