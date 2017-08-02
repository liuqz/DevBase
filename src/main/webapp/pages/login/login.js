$(function(){
    var vm = {
        user: ko.observable({"username":null, "password": null, "rem": false}),

        submit: function(obj) {
            if(obj.username !== null && obj.password!==null){
                $.ajax({
                    type: "post",
                    url: "/DevBase/dologin",
                    dataType: "json",
                    data:obj,
                    success:function(json){

                    }
                });
            } else {
                layer.msg("用户名或密码为空!");
            }

        }
    };
    ko.applyBindings(vm);
});