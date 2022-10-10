<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri= "http://www.springframework.org/tags/form" %>



<!DOCTYPE html>
<html>
<head>
    <title>Add Athlete</title>
    <style>
    .error{
            color:red;
            font-style: italic;
    }
    </style>
</head>

<body>

    <h2>Athlete Form</h2>
    <form:form action="showAthleteDetails" modelAttribute="athlete">

        <label>Name </label>
        <form:input path="name" />
        <form:errors path="name" cssClass="error" />
        <br><br>

        <label>Country </label>
        <form:select path="country" >

            <form:option label="IN" value="India"/>
            <form:option label="US" value="USA"/>
            <form:option label="NE" value="Nepal" />
            <form:option label="AU" value="Australia" />
        </form:select>
        <br><br>

        <label>Rank</label>
        <form:radiobutton path="rank" label="Grade 1" value="A" />
        <form:radiobutton path="rank" label="Grade 2" value="B" />
        <form:errors path="rank" cssClass="error" />
        <br><br>

        <label>Tournaments </label>
        <form:checkbox path="tournaments" label="US Open" value="US Open Tournament"/>
        <form:checkbox path="tournaments" label="Durbon Tour" value="Dourbon Tournament"/>
        <form:checkbox path="tournaments" label="Asia Open" value="Asia Open "/>
        <br><br>

        <label>Designation</label>
        <form:input path="designation" />
        <form:errors path="designation" cssClass="error" />
        <br><br>

        <label>DOB</label>
        <form:input path="dob" />
        <form:errors path="dob" cssClass="error" />
        <br><br>

        <input type="submit" value="Submit" />
    </form:form>


</body>
</html>