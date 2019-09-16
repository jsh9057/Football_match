
/**
 *
var idcheck_State = false;
var userCall
var userCall_ok 
const idcheckbtn = document.querySelector("#callcheck-button");

idcheckbtn.addEventListener('click', function(){

	var returnData = "";
	if (userCall = $("#call_box").val()==null){
		alert("번호를 입력해 주십시오.");
		return null;
	}
	idcheck().done(function(data){
	var result = data.result;
	console.log("result : "+result);
	if (result =="possible"){
		alert("사용가능한 번호 입니다.");
		idcheck_State = true;
		userCall_ok = $("#call_box").val();
	}
	else if (result == "impossible"){
		alert("이미 존재하는 번호 입니다.");
		idcheck_State = false;
	}
	});
	
});


const registbtn = document.querySelector("#callregist-button");
registbtn.addEventListener('click', function(){
	var pwd_box = $("#pwd_box").val();
	var pwd_box2 = $("#pwd_box2").val();
	userCall = $("#call_box").val();
	
	if(userCall_ok=!userCall_check){
		idcheck_State = false;
	}
	if(idcheck_State == false){alert("핸드폰 번호 중복 확인이 필요합니다");}
	else if ((pwd_box==null)||(pwd_box!=pwd_box2)){alert("패스워드 확인이 필요합니다.");}
	else{
		alert(pwd_box);
		alert(pwd_box2);
		var form = document.createElement("form");
		form.setAttribute("charset","UTF-8");
		form.setAttribute("method","Post");
		form.setAttribute("action","/signup2");
		
		var hidden_call = document.createElement("input");
		hidden_call.setAttribute("type","hidden");
		hidden_call.setAttribute("name","t_call");
		hidden_call.setAttribute("value",userCall);
		form.appendChild(hidden_call);
		
		var hidden_pwd = document.createElement("input");
		hidden_pwd.setAttribute("type","hidden");
		hidden_pwd.setAttribute("name","t_pwd");
		hidden_pwd.setAttribute("value",pwd_box);
		form.appendChild(hidden_pwd);
		
		document.body.appendChild(form);
		form.submit();
	}
	
});



function idcheck() {
	userCall = $("#call_box").val();
	
	return $.ajax({
		type : 'POST',
		data : userCall,
		url : "restmyteam/callcheck",
		dataType: "json",
		contentType: "application/json; charset=UTF-8",
		error : function(error){
			console.log(error);
		}
	});
	
}
 */