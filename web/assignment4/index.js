function validateName(name) {
    var letters = /^[A-Za-z]+$/;
    if (name.value.length > 0 && name.value.match(letters))
        return true;
    else if (name.value.length == 0)
        alert("Name is a required field.");
    else
        alert("Name should only contain letters.");
    name.focus();
    return false;
}

function validateMobile(number) {
    var numbers = /^[0-9]+$/;
    if (number.value.length == 10 && number.value.match(numbers))
        return true;
    else if (number.value.length == 0)
        alert("Mobile number is a required field.");
    else
        alert("Invalid Mobile number. Enter a valid Mobile number.");
    number.focus();
    return false;
}

function validateEmail(email) {
    var pattern = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    if (email.value.length == 0)
        alert("Email is a required field.");
    else if (email.value.match(pattern))
        return true;
    else
        alert("Invalid email address. Enter a valid email address.");
    email.focus();
    return false;
}

function validatePassword(password) {
    if (password.value.length == 0)
        alert("Password is a required field.");
    else if (password.value.length >= 8 && password.value.length <= 32)
        return true;
    else
        alert("Password must be between 8 to 32 characters in length.");
    password.focus();
    return false;
}

function matchPass(pswd, cnfpswd) {
    if (pswd.value == cnfpswd.value)
        return true;
    else
        alert("Passwords do not match.");
    cnfpswd.focus();
    return false;
}

function validateGender(gender) {
    if (gender.value.length != 0)
        return true;
    else
        alert("Gender is a required field.")
    return false;
}

function validateRole(role) {
    if (role.value != "default")
        return true;
    else
        alert("Prefered role is a require field.")
    role.focus();
    return false;
}

function validateForm() {
    var form = document.regform;
    var name = form.name;
    var mobileNumber = form.mobilenumber;
    var email = form.email;
    var gender  = form.gender;
    var password = form.password;
    var confirmPassword = form.confirmpassword;
    var role = form.role;

    if (validateName(name) && validateEmail(email)&& validatePassword(password)
        && matchPass(password, confirmPassword) && validateGender(gender)
        && validateMobile(mobileNumber) && validateRole(role))
        return true;
    else 
        return false;
}

$(document).ready(function () {

    var prev = null;

    $("#submit-btn").click(function() {
        if (validateForm()) {
            $("#form").append('<h3 id="success">Form has been validated</h3>');
            $("#success").css("background-color", "turquoise");
        } else {
            $("#success").remove();
        }
    });

    $("#reset-btn").click(function() {
        $("#success").remove();
    });

    $(".lang-check").click(function () {
        $(".lang-check").each(function(){
            if($(this).is(":checked")) {
                $("#"+this.id+"span").fadeIn();
            } else {
                $("#"+this.id+"span").fadeOut();
            }
        });
    });

    $("#role").on("change", function(){
        var curr = "#" + $("#role").val();
        if (prev === null) {
            $(curr).fadeIn();
        } else {
            $(prev).fadeOut().promise().done(function() {
                $(curr).fadeIn();
            });
        }
        prev = curr;
    });
});