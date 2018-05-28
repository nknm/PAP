//$(document).keydown(function (event) {
//    if (event.keyCode == 123) {
//        return false;
//    } else if (event.ctrlKey && event.shiftKey && event.keyCode == 73) {   
//        return false;
//    }
//});
//$(document).on("contextmenu", function (e) {        
//    e.preventDefault();
//});


function dynInput(cbox) {
  if (cbox.checked) {
    var input = document.createElement("input");
    input.type = "text";
    var div = document.createElement("div");
    div.name = cbox.name;
    div.id = cbox.name;
    div.innerHTML = "How many units for " + cbox.name + " size. ";
    div.appendChild(input);
    document.getElementById("insertinputs").appendChild(div);
  } else {
    document.getElementById(cbox.name).remove();
  }
}

// https://stackoverflow.com/questions/25870898/input-field-appear-after-selecting-a-check-box-html boxes