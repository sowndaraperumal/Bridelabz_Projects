import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CurrentNotesComponent } from './current-notes.component';

describe('CurrentNotesComponent', () => {
  let component: CurrentNotesComponent;
  let fixture: ComponentFixture<CurrentNotesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CurrentNotesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CurrentNotesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
