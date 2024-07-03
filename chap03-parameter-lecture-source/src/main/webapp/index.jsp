<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Parameter</title>
</head>
<body>
    <h1>Request Parameter</h1>
    <h3>Get 방식의 요청</h3>
    <h4>form 태그를 이용한 get 방식 요청</h4>
    <form action = "querystring" method = "get">
        <label 이름 : ></label><input type="text" name="name">
        <br>
        <label 나이 : ></label><input type="number" name="age">
        <br>
        <label 생일 : ></label><input type="date" name="birthday">
        <br>
        <label 성별 : ></label>
        <input type="radio" name="getnder" id ="male" value ="M"><label for="male">남자</label>
        <input type="radio" name="getnder" id ="female" value ="F"><label for="female">여자</label>
        <br>
        <label>국적 : </label>
        <select name = "national">
            <option valule ="kg">한국</option>
            <option valule ="cn">중국</option>
            <option valule ="jg">일본</option>
            <option valule ="etc">기타</option>
        </select>
        <br>
        <label>취미 :</label>
        <input type ="checkbox" name ="hobbies" id="movie" value="movie"><lable for="movie">영화</lable>
        <input type ="checkbox" name ="hobbies" id="music" value="music"><lable for="music">음악</lable>
        <input type ="checkbox" name ="hobbies" id="sleep" value="sleep"><lable for="sleep">취침</lable>
        <br>

        <input type="submit" value="GET 요청">
    </form>

    <h4> a태그의 href 속성에 파라미터를 쿼리스트링 형태로 작성하여 get 방식 요청</h4>
    <a href=""> 쿼리스트링을 이용한 값 전달
    </a>

    <h3>Post 방식의 요청</h3>
    <h4>form 태그를 이용한 get 방식 요청</h4>
    <form action = "formdata" method = "post">
        <label 이름 : ></label><input type="text" name="name">
        <br>
        <label 나이 : ></label><input type="number" name="age">
        <br>
        <label 생일 : ></label><input type="date" name="birthday">
        <br>
        <label 성별 : ></label>
        <input type="radio" name="getnder" id ="male2" value ="M"><label for="male2">남자</label>
        <input type="radio" name="getnder" id ="female2" value ="F"><label for="female2">여자</label>
        <br>
        <label>국적 : </label>
        <select name = "national">
            <option valule ="kg">한국</option>
            <option valule ="cn">중국</option>
            <option valule ="jg">일본</option>
            <option valule ="etc">기타</option>
        </select>
        <br>
        <label>취미 :</label>

        <input type ="checkbox" name ="hobbies2" id="movie2" value="movie2"><lable for="movie2">영화</lable>
        <input type ="checkbox" name ="hobbies2" id="music2" value="music2"><lable for="music2">음악</lable>
        <input type ="checkbox" name ="hobbies2" id="sleep2" value="sleep2"><lable for="sleep2">취침</lable>

        <br>

        <input type="submit" value="post 요청">
    </form>

    <h4> a태그의 href 속성에 파라미터를 쿼리스트링 형태로 작성하여 get 방식 요청</h4>
    <a href="http://localhost:8080/querystring?name=%EA%B0%95%EC%A7%84%EC%98%81&age=5&birthday=2024-07-01&national=%ED%95%9C%EA%B5%AD&hobbies=movie"> 쿼리스트링을 이용한 값 전달
    </a>
</body>


</html>