window.__loadJs&&window.__loadJs('/edu_modules/ckeditor.init/src/addlink.1be66717.js?max_age=3153600',1);
/*!edu_modules/ckeditor.init/src/util*/
;define("edu_modules/ckeditor.init/src/util",function(e,t,r){var i=(navigator.userAgent.match(/\bMSIE\s+(\d+)\b/)||[0,10])[1]<8,n=/\bMSIE\b/i.test(navigator.userAgent),a=function(e){return e&&e.document&&e.document.$&&e.document.$.body},c=function(e){return e&&e.getData?$.trim(e.getData().replace(/\n/g,"")):$("#"+e.name).val().replace(/\n/g,"<br/>")},o=function(e,t){e&&e.insertHtml(t)},s=function(e){var t=e[0];if(t&&"file"===t.kind&&t.type.match(/^image\//i)){var r=t.getAsFile(),i=new FileReader;i.onload=function(){var e=this.result.toString().replace(/^[^,]+/,"");DB.upload_pic_base64({param:{type:2,filename:e},succ:function(e){_uploadPicSucc(e||{})},err:function(e){_uploadPicErr(e||{})}})},i.readAsDataURL(r)}},l=function(){var e=new ActiveXObject("TXGYMailActiveX.ScreenCapture");return e?e.SaveClipBoardBmpToFile(1):!1},u=function(){uploader(l())},d=function(){setTimeout(function(e){var t=a(e);if(t){var r=$(t);r.off(n?"keydown":"paste"),r.on(n?"keydown":"paste",function(e){if(e)if(n)e.ctrlKey&&86===e.keyCode&&u();else{var t=(e.originalEvent||e).clipboardData||{};s(t.items||[])}})}else d(e)},1e3)},f=function(e){return e.replace(/[\n\r]+/g,"").replace(/^.+<\s*body[^>]*>/i,"").replace(/<\s*\/\s*body\s*>.*$/i,"").replace(/(<a\s+[^>]*)name\s*=\s*['"]?\w+['"]?([^>]*>)/gi,"$1$2").replace(/<\s*(\w+)\s*>/gi,"<$1>")},p=function(e,t,r){if(i){var n=$(e.selector);n.val(m(t))}else e.insertHtml(t),r&&d(e)},m=function(e){return e.toString().replace(/<\s*br\s*\/?\s*>/g,"\n")},g=function(e,t){$("#cke_"+e).css("borderColor","#e80808"),t&&t.setError($("#"+e))},v=function(e,t){t&&t.clearValidateResult($("#"+e))},b=function(e,t){$("#cke_"+e).css("borderColor","#dedede"),t&&t.setSuccess($("#"+e))},_=function(e,t){$("#cke_"+e).css("borderColor","#dedede"),t&&t.setTips($("#"+e))},h=function(e,t){e.validator=t,t.extend("details",function(){var r=e.name,i=c(e);if(0===$.trim(i.replace(/&nbsp;/gi,"").replace(/<\s*br\s*\/?\s*>/gi,"")).length)return t.msg="课程详细信息不能为空",g(r,t),!1;var n=i.match(/https?:\/\/(?:(?:[-\w\.])+\.)?(?:[-\w]+)\.[a-z]{2,4}\b/gi);if(n)for(;n.length;){var a=n.shift();if(!/https?:\/\/(?:(?:[-\w\.])+\.)?(qq\.com|qpic\.cn|url\.cn|myqcloud\.com)\b/i.test(a))return t.msg="腾讯课堂暂不支持外链跳转，请修改后再试",g(r,t),!1}var o=$("<div>"+i+"</div>").find("video");return o.length>e.videoLimit?(t.msg="最多只能添加"+videoLimit+"个视频",g(r,t),!1):(b(r,t),!0)})};r.exports={_getDetails:c,_insertHTML:o,_setDetails:p,_clearHTML:f,_setError:g,_clearError:v,_setSuccess:b,_setTips:_,_initValidator:h}});
/*!edu_modules/ckeditor.init/src/addlink*/
;define("edu_modules/ckeditor.init/src/addlink",function(t,i,e){var l=t("edu_modules/ckeditor.init/src/util");e.exports=function(t){$.Dialog.show({title:"超链接",submit:"确定",isDisabled:!0,confirm:!0,globalClass:"alert-tips",extraClass:"insert-link",content:'<label class="ck_link_input"><input type="text" style="width:100%;"/></label>'});var i=$(".ck_link_input input"),e=$(".insert-link");i.length>0&&i.on("keyup input paste",function(){$.trim(i.val()).length>0?e.removeClass("btn-disabled"):e.addClass("btn-disabled")}),e.click(function(e){e.preventDefault();var n=$.trim(i.val()).replace(/(?:^\s*(?:http:\/\/)*\s*)|(?:\s+$)/gi,"");n&&(l._insertHTML(t,'<a href="'+n+'" target="_blank">'+n+"</a>"),$.Dialog.remove())})}});
window.__loadJs&&window.__loadJs('/edu_modules/ckeditor.init/src/addlink.1be66717.js?max_age=3153600',2);