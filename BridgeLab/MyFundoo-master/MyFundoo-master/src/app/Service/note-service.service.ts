import { Injectable } from '@angular/core';
import { HttpClient,HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { CreateNoteModel } from '../Model/add-notes.model';



@Injectable({
providedIn: 'root'
})
export class NoteServiceService {

constructor(private http:HttpClient) { }

private noteUrl = 'http://192.168.0.41:8080/fundooNote/';

public createNote(newNote:CreateNoteModel):any
{
  var httpOptions = {

    headers: new HttpHeaders({'Content-Type': 'application/json' ,
    'token':localStorage.getItem('jwtToken')}
    )};

return this.http.post<CreateNoteModel>(this.noteUrl+'addNote',newNote,httpOptions);
}



public updateArchiveNote(newNote:CreateNoteModel):any
{
  var httpOptions2 ={
    headers: new HttpHeaders({
      'token':localStorage.getItem('jwtToken')
    })
  };
console.log(this.noteUrl+'addNote');
//console.log(httpOptions.headers);
console.log(newNote.title, newNote.description);
return this.http.put<CreateNoteModel>(this.noteUrl+'note/archive/'+newNote.noteId,null,httpOptions2);
}
public updatePinNote(newNote:CreateNoteModel):any
{
  var httpOptions2 ={
    headers: new HttpHeaders({
      'token':localStorage.getItem('jwtToken')
    })
  };
console.log(this.noteUrl+'addNote');
//console.log(httpOptions.headers);
console.log(newNote.title, newNote.description);
return this.http.put<CreateNoteModel>(this.noteUrl+'note/pin/'+newNote.noteId,null,httpOptions2);
}
public updaterestoreNote(newNote:CreateNoteModel):any
{
  var httpOptions2 ={
    headers: new HttpHeaders({
      'token':localStorage.getItem('jwtToken')
    })
  };
console.log(this.noteUrl+'addNote');
//console.log(httpOptions.headers);
console.log(newNote.title, newNote.description);
return this.http.put<CreateNoteModel>(this.noteUrl+'note/delete/'+newNote.noteId,null,httpOptions2);
}

public updateColorNote(newNote:CreateNoteModel):any
{
  var httpOptions2 ={
    headers: new HttpHeaders({
      'token':localStorage.getItem('jwtToken')
    })
  };
console.log(this.noteUrl+'addNote');
//console.log(httpOptions.headers);
console.log(newNote.title, newNote.description);
return this.http.post<CreateNoteModel>(this.noteUrl+'note/color/'+newNote.noteId,newNote,httpOptions2);
}




public updateEditNote(newNote:CreateNoteModel):any
{
  var httpOptions2 ={
    headers: new HttpHeaders({
      'token':localStorage.getItem('jwtToken')
    })
  };
console.log(this.noteUrl+'addNote');
//console.log(httpOptions.headers);
console.log(newNote.title, newNote.description);
return this.http.put<CreateNoteModel>(this.noteUrl+'note',newNote,httpOptions2);
}


public deleteNote(newNote:CreateNoteModel):any
{
  var httpOptions2 ={
    headers: new HttpHeaders({
      'token':localStorage.getItem('jwtToken')
    })
  };
console.log(newNote.id);
return this.http.put<CreateNoteModel>(this.noteUrl+'/note/delete/'+newNote.id,newNote,httpOptions2);


}



public noteDelete(newNote:CreateNoteModel):any
{
  var httpOptions2 ={
    headers: new HttpHeaders({
      'token':localStorage.getItem('jwtToken')
    })
  };
  console.log(newNote);
//console.log(newNote.id);
return this.http.delete<CreateNoteModel>(this.noteUrl+'note/'+newNote.noteId,httpOptions2);


}



public getnotes():Observable<CreateNoteModel[]> | any
{
  var httpOptions = {

    headers: new HttpHeaders({'Content-Type': 'application/json' ,
    'token':localStorage.getItem('jwtToken')}
    )};
  return this.http.get<CreateNoteModel[]>(this.noteUrl+'note',httpOptions);

}



}