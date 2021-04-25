import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material';
import { FormGroup,FormBuilder, Validators} from '@angular/forms';
import {Router} from '@angular/router';
import { LoginModel } from 'src/app/Model/login.model';
import { UserServiceService } from 'src/app/Service/user-service.service';

@Component({
  selector: 'app-forgot-password',
  templateUrl: './forgot-password.component.html',
  styleUrls: ['./forgot-password.component.css']
})
export class ForgotPasswordComponent implements OnInit {
  constructor(private formBuilder:FormBuilder,private myservice:UserServiceService,private snackBar: MatSnackBar,private router:Router) { }

  user:LoginModel=new LoginModel();
  registerForm :FormGroup;
  ngOnInit() {
    this.registerForm=this.formBuilder.group({
      'email':[this.user.email,[
        Validators.required,
        Validators.email
      ]],
      'password':[this.user.password,[
        Validators.required,
      ]]
       });
  }
    sendOtp(){
      console.log(this.user.email);
      (this.myservice.sendOtp(this.user)).subscribe(
  
        data => { 
          if(data.statusCode== 200)
          {
              this.snackBar.open('enter the otp to reset password', 'otp send', {
                duration: 5000,});
              this.router.navigate(["setpassword" ]);
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
