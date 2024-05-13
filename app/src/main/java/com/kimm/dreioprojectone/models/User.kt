package com.kimm.dreioprojectone.models



class Login{
    var email:String=""
    var pass:String=""
    private var userid:String=""

    constructor(email:String,pass:String,userid:String){
        this.email=email
        this.pass=pass
        this.userid=userid

    }
    constructor()
}