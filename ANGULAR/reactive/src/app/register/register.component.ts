import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, FormArray } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

forms: FormGroup;


  constructor() { }

  ngOnInit() {
this.forms = new FormGroup({

name : new FormControl(),
email : new FormControl(),
password : new FormControl(),
skills : new FormArray([
this.skillField()
])
});


  }

  skillField() {
    return new FormGroup({
      skill : new FormControl(),
      rating : new FormControl()
    })
  }
  removeskill(i: number) {
    (this.forms.get('skills') as FormArray).removeAt(i);

  }
  addSkill() {
    (this.forms.get('skills') as FormArray).push(this.skillField());
  }
  printForm() {
    console.log(this.forms);
  }

}
