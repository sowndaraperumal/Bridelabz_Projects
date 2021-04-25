export class CreateNoteModel{
    title:string; //cannot be null
    description:string; //cannot be null
    id:number; //cannot be null
    pinned:boolean;
    color:string;
    archive:boolean;
    trash:boolean;
    createStamp:Date;
    image:string;
    lastModifiedStamp:string;
    remainder:string;
    noteId:number;
    }