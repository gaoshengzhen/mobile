<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0"/>
    <title>Document</title>
    <style>
        *{
            margin: 0;
            padding: 0;
        }
        h3{
            width: 960px;
            margin:0 auto;
            height: 100px;
            text-align: center;
            line-height: 100px;
            margin-top:20px;
        }
       
        
        
        #img-box .img01_s,#img-box .img01_s_2x{
            display: none;
        }
        .txt-box{
            width: 960px;
            margin:0 auto;
            overflow: hidden;
        }
        .left{
            width: 250px;
           
            float: left;
            height: 300px;
            display: table;
        }
        .right{
            width: 710px;
            float:right;
            height: 300px;
            display: table;
        }
       
        

        @media screen and (max-width:960px){
            h3{
                width:100%;
            }    
            .txt-box{
                width:100%;
            }
            .left{
                width:30%;
            }
            .right{
                width:70%;
            }
          
        }
        @media screen and (max-width:480px){
            #img-box .img01_s_2x{
                display: block;
            }
            #img-box .img01,#img-box .img01_s{
                display: none;
            }
            .left{
                width:100%;
            }
            .right{
                width:100%;
            }
        }
        
    </style>
</head>
<body>
    <h3>
        页头
    </h3>
    <div class="txt-box">
        <div class="left">
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris sem erat, egestas quis luctus ut, rhoncus vitae risus. Integer venenatis libero sit amet sapien dictum, quis bibendum mi volutpat. Cras pretium quam quis magna facilisis, eget feugiat nisi lacinia.</p>
        </div>
        <div class="right">
            <p>
                Donec dolor arcu, interdum sed turpis faucibus, placerat ultricies felis. Donec pulvinar gravida rhoncus. Suspendisse vestibulum est eget dolor lobortis.
            </p>
        </div>
    </div>



</body>
</html>