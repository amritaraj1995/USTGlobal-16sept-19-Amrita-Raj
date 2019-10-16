import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { RouterModule } from '@angular/router';
import { RegisterComponent } from './register/register.component';
import { FormsModule} from '@angular/forms';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    RegisterComponent,
    HomeComponent,
    AboutComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    RouterModule.forRoot([
      {path : 'header' , component:   HeaderComponent },
      {path : 'register' , component:   RegisterComponent },
      {path : 'home' , component:   HomeComponent },
      {path : 'about' , component:   AboutComponent }
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
