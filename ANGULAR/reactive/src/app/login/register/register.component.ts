import { Component, OnInit } from '@angular/core';
import { MyappService } from 'src/app/myapp.service';
import { FormGroup, FormControl, FormArray } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  registerForm: FormGroup;
  constructor(private service: MyappService) { }

  ngOnInit() {
    this.registerForm = new FormGroup({
      name : new FormControl(),
      email : new FormControl(),
      password : new FormControl(),
      skills : new FormArray([
        this.skillField()
      ])
    });
  }
skillField() {
  return new FormControl();
}
addSkills() {
  (this.registerForm.get('skills') as FormArray).push(this.skillField());
}
printForm() {
  console.log(this.registerForm);
}
}
