import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import{RouterModule,Routes} from '@angular/router';
import { ForgotPasswordComponent } from './Component/forgotPassword/forgot-password.component';
import { LoginComponent } from './Component/login/login.component';
import { HomeComponent } from './Component/home/home.component';
import { DashboardComponent } from './Component/dashboard/dashboard.component';
import {AddNoteComponent} from './Component/add-note/add-note.component';
import {RemainderComponent} from './Component/remainder/remainder.component';
import {ArchiveComponent} from './Component/archive/archive.component';
import { TrashComponent } from './Component/trash/trash.component';
import { OtpComponent } from './Component/otp/otp.component';
import { SetPasswordComponent } from './Component/set-password/set-password.component';
import { NotesComponent } from './Component/notes/notes.component';
import { RegisterComponent } from './Component/register/register.component';
import { CurrentNotesComponent } from './Component/current-notes/current-notes.component';
const appRoutes: Routes =[
  {
    path:'',
    component:HomeComponent
  },
 {
  path:'register',
  component:RegisterComponent
},
{
  path:'forgetPassword',
  component:ForgotPasswordComponent
},
{
  path:'login',
  component:LoginComponent
},


 
  
{
  path:'dashboard',
  component:DashboardComponent,
  children:[
    {
      path:'',
      component:CurrentNotesComponent
    },
    
{
  path:'addNote',
  component:CurrentNotesComponent
},
{
  path:'remainder',
  component:RemainderComponent
},
{
  path:'archive',
  component:ArchiveComponent
  },
  {
  path:'trash',
  component:TrashComponent
  
  }


  ]


},{
path:'otp',
component:OtpComponent
},
{
  path:'trash',
  component:TrashComponent
  
  },
  {
    path:'setpassword',
    component:SetPasswordComponent
  },{
    path:'notes',
    component:NotesComponent
  }

];
 
@NgModule({
  imports: [
    RouterModule.forRoot(appRoutes)
  ],
  exports:[RouterModule],
  declarations: []
})

export class AppRoutingModule { }
