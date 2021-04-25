import { Component, Inject } from '@angular/core';
import { map } from 'rxjs/operators';
import { Breakpoints, BreakpointObserver } from '@angular/cdk/layout';
import {Router} from '@angular/router';
import { Location } from '@angular/common';
import { MAT_DIALOG_DATA, MatDialogRef, MatDialog } from '@angular/material';
import { CardsupdateServiceService } from 'src/app/Service/cardsupdate-service.service';
import { LabelDailogBoxComponent } from 'src/app/Component/label-dailog-box/label-dailog-box.component';




export interface DialogData {
  animal: string;
  name: string;
}

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent {
  public headerName = "Fundoo Notes";
  panelOpenState = false;
  viewChange=false;
  nameFirstLetter: String;
  
  label: string;
name:string;
  
  constructor(public dialog: MatDialog,private router: Router) { }


  ngOnInit() {
   
    let userCredentials = JSON.parse(localStorage.getItem("userData"));
    this.nameFirstLetter = userCredentials.data.name.toUpperCase();
console.log( userCredentials.data.name.toUpperCase());


  }


  openDialog(): void {
    const dialogRef = this.dialog.open(LabelDailogBoxComponent, {
      height: '220px',
      width: '400px',
           data: {label: this.label}
    });

    dialogRef.afterClosed().subscribe(result => {
      console.log('The dialog was closed');
      this.label = result;
    });
  }
  /** Based on the screen size, switch from standard to one column per row */
  logout():void{
 
    localStorage.removeItem('jwtToken');
    localStorage.removeItem('userData')
    this.router.navigate(["login"])
  }}
  
  // note():void{
  //   this.router.navigate(["addNote"])
  // }
  // remainder():void{
  //   this.router.navigate(["remainder"])
  // }
  // archive():void{
  //   this.router.navigate(["archive"])
  // }
  // trash():void{
  //   this.router.navigate(["trash"])
  // }
  
  
  



