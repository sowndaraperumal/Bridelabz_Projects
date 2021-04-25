// import{MatButtonModule,MatCheckboxModule,MatInputModule} from '@angular/material';
import { NgModule } from '@angular/core';

import { CommonModule } from '@angular/common';
import {
MatButtonModule, MatCardModule, MatDialogModule, MatInputModule, MatTableModule,

MatToolbarModule, MatMenuModule,MatIconModule, MatProgressSpinnerModule,MatSidenavModule,
MatListModule,MatExpansionModule,MatSnackBarModule,MatTooltipModule,MatDatepickerModule,MatNativeDateModule
} from '@angular/material';
@NgModule({
imports: [
CommonModule, MatNativeDateModule, 
MatTooltipModule,
MatExpansionModule,
MatToolbarModule,
MatButtonModule, 
MatCardModule,
MatInputModule,
MatDialogModule,
MatTableModule,
MatMenuModule,
MatIconModule,
MatProgressSpinnerModule,
MatListModule,
MatSidenavModule,
MatSnackBarModule,MatDatepickerModule
],
exports: [
  
  MatDatepickerModule,
  MatTooltipModule,
  MatSnackBarModule,MatNativeDateModule,
  MatExpansionModule,
CommonModule,MatDialogModule,
MatToolbarModule, 
MatButtonModule, 
MatCardModule, 
MatInputModule, 
MatTableModule, 
MatMenuModule,
MatIconModule,
MatProgressSpinnerModule,
MatListModule,
MatSidenavModule
],
})
  export class MaterialModule {
  }