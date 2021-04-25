import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
import { FormGroup,FormBuilder, Validators} from '@angular/forms';
import { NumberValueAccessor } from '@angular/forms/src/directives';

import { MatSnackBar } from '@angular/material';
import { UserServiceService } from 'src/app/Service/user-service.service';
import { RegisterModel } from 'src/app/Model/register.model';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  
  
  constructor(private formBuilder:FormBuilder,private myservice:UserServiceService,private snackBar: MatSnackBar,private router:Router) { }

    user:RegisterModel=new RegisterModel();
    registerForm :FormGroup;
    ngOnInit() {
      this.registerForm=this.formBuilder.group({
        'email':[this.user.email,[
          Validators.required,
          Validators.email
        ]],
        'password':[this.user.password,[
          Validators.required,
          Validators.minLength(8),
          Validators.maxLength(30)
        ]],
        'name':[this.user.name,[
          Validators.required
        ]],
        'mobileNumber':[this.user.mobileNumber,[
          Validators.maxLength(10)
        ]]
      });
    }
      onRegisterSubmit(){
        console.log(this.user.email);
        (this.myservice.createUser(this.user)).subscribe(
    
          data => { 
            if(data.statusCode== 200)
            {
                this.snackBar.open('Successfully Register Please Confirm Your Email Address', 'LogIn', {
                  duration: 2000,});
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

