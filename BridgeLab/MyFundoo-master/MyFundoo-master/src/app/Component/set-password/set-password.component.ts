import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material';
import { FormGroup,FormBuilder, Validators} from '@angular/forms';
import {Router} from '@angular/router';
import { UserServiceService } from 'src/app/Service/user-service.service';
import { OtpVerify } from 'src/app/Model/otp.model';

@Component({
  selector: 'app-set-password',
  templateUrl: './set-password.component.html',
  styleUrls: ['./set-password.component.css']
})
export class SetPasswordComponent implements OnInit {

  constructor(private formBuilder:FormBuilder,private myservice:UserServiceService,private snackBar: MatSnackBar,private router:Router) { }

  otp:OtpVerify=new OtpVerify();
  registerForm :FormGroup;
  ngOnInit() {
    this.registerForm=this.formBuilder.group({
      'otp':[this.otp.otp,[
        Validators.required,
      ]]
       });
  }
  setPassword(){
    console.log(this.otp.otp);
    (this.myservice.setPassword(this.otp)).subscribe(

      data => { 
        if(data.statusCode== 200)
        {
            this.snackBar.open('enter the otp to reset password', 'otp send', {
              duration: 5000,});
            this.router.navigate(['/login']);
        }
        else{
        this.snackBar.open(data.statusMessage,"Register Fails",{
          duration:2000,})
        }},
        
       error => {
           console.log("Error", error);
       }

      );
       
  }
  

}
