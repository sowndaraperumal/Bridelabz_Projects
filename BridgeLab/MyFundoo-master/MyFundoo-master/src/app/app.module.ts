import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';

import { AppRoutingModule } from './/app-routing.module';
import { ForgotPasswordComponent } from './Component/forgotPassword/forgot-password.component';
import {FormsModule,ReactiveFormsModule} from '@angular/forms';

import { LoginComponent } from './Component/login/login.component';
import{MaterialModule} from '../material.module';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { HomeComponent } from './Component/home/home.component';
import { DashboardComponent} from './Component/dashboard/dashboard.component';
import { MatGridListModule, MatCardModule, MatMenuModule, MatIconModule, MatButtonModule } from '@angular/material';
import { LayoutModule } from '@angular/cdk/layout';
import { AddNoteComponent } from './Component/add-note/add-note.component';
import { RemainderComponent } from './Component/remainder/remainder.component';
import { ArchiveComponent } from './Component/archive/archive.component';
import { TrashComponent } from './Component/trash/trash.component';
import { OtpComponent } from './Component/otp/otp.component';
import{HttpClientModule} from '@angular/common/http';
import { SetPasswordComponent } from './Component/set-password/set-password.component';
import { NotesComponent } from './Component/notes/notes.component';
import { RegisterComponent } from './Component/register/register.component';
import { UserServiceService } from './Service/user-service.service';
import { CurrentNotesComponent } from './Component/current-notes/current-notes.component';
import { TrashBarComponent } from './Component/trash-bar/trash-bar.component';
import { EditDailogBarComponent } from './Component/edit-dailog-bar/edit-dailog-bar.component';
import { LabelDailogBoxComponent } from './Component/label-dailog-box/label-dailog-box.component';

@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    ForgotPasswordComponent,
    LoginComponent,
    HomeComponent,
    DashboardComponent,
    AddNoteComponent,
    RemainderComponent,
    ArchiveComponent,
    TrashComponent,
    OtpComponent,
    SetPasswordComponent,
    NotesComponent,
    
    CurrentNotesComponent,
    TrashBarComponent,
    EditDailogBarComponent,
    LabelDailogBoxComponent

  ],
  imports: [
    HttpClientModule,
    BrowserModule,
    ReactiveFormsModule,
    AppRoutingModule ,
    MaterialModule,
    BrowserAnimationsModule,
   FormsModule,
   MatGridListModule,
   MatCardModule,
   MatMenuModule,
   MatIconModule,
   MatButtonModule,
   LayoutModule
  ],
  providers: [UserServiceService],
  bootstrap: [AppComponent],
  entryComponents:[LabelDailogBoxComponent  ,EditDailogBarComponent]
})
export class AppModule { }
