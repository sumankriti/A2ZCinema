import { ActivatedRoute } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { UserService } from '../services/userservice.service';

@Component({
  selector: 'app-viewprofile',
  templateUrl: './viewprofile.component.html',
  styleUrls: ['./viewprofile.component.css']
})
export class ViewprofileComponent implements OnInit {
public userId;
public userData;
public subData;
  constructor(private router:ActivatedRoute,private service:UserService) { }

  ngOnInit() {
    this.router.paramMap.subscribe(params=>{
      this.userId=params.get('id');
      console.log("id is coming:"+this.userId);
    });
  this.service.getUserById(this.userId).subscribe(res=>{
    this.userData=res;
    console.log(this.userData);
  });
  this.service.getActor(this.userId).subscribe(res=>{
    this.subData=res;
    console.log(this.subData);
   })
  }

}
