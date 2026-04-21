<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Student Result Form</title>
    <script>
        function validateForm() {
            let rollno = document.forms["studentForm"]["rollno"].value;
            let name = document.forms["studentForm"]["studentname"].value;
            let subjects = ["sub1", "sub2", "sub3", "sub4", "sub5"];

            if (rollno == "" || name == "") {
                alert("Roll No and Student Name are required");
                return false;
            }

            for (let i = 0; i < subjects.length; i++) {
                let mark = document.forms["studentForm"][subjects[i]].value;

                if (mark == "" || mark < 0 || mark > 100) {
                    alert("Marks should be between 0 and 100");
                    return false;
                }
            }

            return true;
        }
    </script>
</head>
<body>
    <h2>Student Marks Form</h2>

    <form name="studentForm" action="ResultServlet" method="post"
          onsubmit="return validateForm()">

        Roll No: <input type="text" name="rollno"><br><br>
        Student Name: <input type="text" name="studentname"><br><br>

        Subject 1: <input type="number" name="sub1"><br><br>
        Subject 2: <input type="number" name="sub2"><br><br>
        Subject 3: <input type="number" name="sub3"><br><br>
        Subject 4: <input type="number" name="sub4"><br><br>
        Subject 5: <input type="number" name="sub5"><br><br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>
