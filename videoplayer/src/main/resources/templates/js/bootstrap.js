
var host = "http://localhost:8080"
$(function(){

    // 获取视频列表
    function get_list(){

        $.ajax({

            type:'get',
            url: host+"/page",
            dataType:'json',
            success:function (res) {
                var data = res.data;

                for (var i=0; i<data.length; i++){
                    console.info(data[i]);
                    var video = data[i];

                    var template = "<tr><td>"+video.id+"</td><td>Monitor1</td><td>"+video.name+"</td><td>"+video.path+"</td><td>"+video.url+"</td></tr>";

                    $("#list").append(template);
                }

            }
        })
    }
    get_list();
})

function play_video1(){
    var data = $('#form1');
    var id = data.find('#inputId1').val();

    $.ajax({
        url: host+'/play',
        async: false,
        dataType: 'json',
        data: {'id': id},
        type: 'get',
        crossDomain: true,

        success: function(res){
            console.log(res);
             var url = res.url;

             document.getElementById("video-div1").innerHTML="<div>" +
                 "<form id='form1'>" +
                 "<h2 class='form-signin-heading'>Player 1</h2>" +
                 "<input type='text' id='inputId1' placeholder='Video Id'>" +
                 "<button class='btn' type='submit' onclick='play_video1()'>Play!</button>" +
                 "</form>" +
                 "</div><a href='#'>" +
                 "<video id='video1' controls='controls' autoplay='true' muted='' name='media'>" +
                 "<source src="+url+" type='video/mp4'>" +
                 "</video>" +
                 "</a>";
        }
    })
}

function play_video2(){
    var data = $('#form2');
    var id = data.find('#inputId2').val();

    $.ajax({
        url: host+'/play',
        async: false,
        dataType: 'json',
        data: {'id': id},
        type: 'get',
        crossDomain: true,

        success: function(res){
            console.log(res);
            var url = res.url;

            document.getElementById("video-div2").innerHTML="<div>" +
                "<form id='form2'>" +
                "<h2 class='form-signin-heading'>Player 2</h2>" +
                "<input type='text' id='inputId2' placeholder='Video Id'>" +
                "<button class='btn' type='submit' onclick='play_video2()'>Play!</button>" +
                "</form>" +
                "</div><a href='#'>" +
                "<video id='video2' controls='controls' autoplay='true' muted='' name='media'>" +
                "<source src="+url+" type='video/mp4'>" +
                "</video>" +
                "</a>";
        }
    })
}

function play_video3(){
    var data = $('#form3');
    var id = data.find('#inputId3').val();

    $.ajax({
        url: host+'/play',
        async: false,
        dataType: 'json',
        data: {'id': id},
        type: 'get',
        crossDomain: true,

        success: function(res){
            console.log(res);
            var url = res.url;

            document.getElementById("video-div3").innerHTML= "<a href=\"#\">\n" +
                "<video id='video3' controls='controls' autoplay='autoplay' muted='' name='media'>" +
                "<source src="+url+" type='video/mp4'>" +
                "</video>" +
                "</a>" +
                "<div>" +
                "<form id='form3'>" +
                "<h2 class=''>Player 3</h2>" +
                "<input type='text' id='inputId3' placeholder='Video Id'>" +
                "<button class='btn' type='submit'>Play!</button>" +
                "</form>" +
                "</div>";
        }
    })
}

function play_video4(){
    var data = $('#form4');
    var id = data.find('#inputId4').val();

    $.ajax({
        url: host+'/play',
        async: false,
        dataType: 'json',
        data: {'id': id},
        type: 'get',
        crossDomain: true,

        success: function(res){
            console.log(res);
            var url = res.url;

            document.getElementById("video-div4").innerHTML="<a href=\"#\">\n" +
                "<video id='video4' controls='controls' autoplay='autoplay' muted='' name='media'>" +
                "<source src="+url+" type='video/mp4'>" +
                "</video>" +
                "</a>" +
                "<div>" +
                "<form id='form4'>" +
                "<h2 class=''>Player 4</h2>" +
                "<input type='text' id='inputId4' placeholder='Video Id'>" +
                "<button class='btn' type='submit'>Play!</button>" +
                "</form>" +
                "</div>";
        }
    })
}
