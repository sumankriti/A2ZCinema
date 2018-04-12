import { UserService } from './../services/userservice.service';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-audition',
  templateUrl: './audition.component.html',
  styleUrls: ['./audition.component.css']
})
export class AuditionComponent implements OnInit {
public userData;
  constructor(private service:UserService,private router:Router) { }

  ngOnInit() {
    this.service.getUserDefault().subscribe(res=>{
     this.userData=res;
     console.log(this.userData);
    })
  }
  onView(userId)
  {
    console.log("id is coming"+userId);
    this.router.navigate(['/viewprofile',userId]);
  }

}
