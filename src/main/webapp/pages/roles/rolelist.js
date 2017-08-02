/**
 * Created by Liuqz on 2017-7-26.
 */
$(function () {
    var vm = {
        user: ko.observableArray(),
        single: ko.observable(),

        loadvm:function () {
            $.ajax({
                type : 'get',
                url : 'dept/list',
                dataType : 'json',
                contentType: 'application/json;charset=utf-8',
                success : function(json) {
                    vm.user(json);
                },
                error: function (xhr,status,et) {
                    layer.alert(status);
                }
            });
        },
        counter: function(){
            layer.msg(JSON.stringify(vm.user()));
        },
        del: function(obj) {
            vm.user.remove(obj);
        },
        edit: function(obj){
            vm.single(obj);
            layer.open({
                    type:1,
                    content: $('#editko'),
                    area: ['480px', '300px'],
                    btn: ['确定', '取消']
                },
                function(index){

                    layer.close(index);
                },
                function(index){
                    layer.close(index);
                });
        },
        pop: function(){
            vm.user.pop();
        },
        push: function(obj){
            vm.user.push(obj);
        },
        tablecompact: function () {
            $("#ko-table").addClass("wf-table-compact");
        },
        tablenormal: function () {
            $("#ko-table").removeClass("wf-table-compact");
        }

    };
    ko.applyBindings(vm);
});