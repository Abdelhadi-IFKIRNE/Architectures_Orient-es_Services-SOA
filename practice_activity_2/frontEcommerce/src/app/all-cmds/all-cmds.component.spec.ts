import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AllCmdsComponent } from './all-cmds.component';

describe('AllCmdsComponent', () => {
  let component: AllCmdsComponent;
  let fixture: ComponentFixture<AllCmdsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AllCmdsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AllCmdsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
