import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddcmdComponent } from './addcmd.component';

describe('AddcmdComponent', () => {
  let component: AddcmdComponent;
  let fixture: ComponentFixture<AddcmdComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddcmdComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddcmdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
