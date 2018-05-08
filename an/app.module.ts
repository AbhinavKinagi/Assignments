import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';

import { BookFormComponent } from './book-form/book-form.component';
import { Book1FormComponent } from './book1-form/book1-form.component';

@NgModule({
  declarations: [
    AppComponent,
    BookFormComponent,
    Book1FormComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
