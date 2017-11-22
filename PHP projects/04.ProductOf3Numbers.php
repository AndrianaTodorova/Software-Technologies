<form>
    Num1: <input type="text" name="num1"/>
    Num2: <input type="text" name="num2"/>
    Num3: <input type="text" name="num3"/>
    <input type="submit" name="result">
</form>

<?php
if(isset($_GET['num1']) && isset($_GET['num2']) && isset($_GET['num3'])){
    $num1 = $_GET['num1'];
    $num2 = $_GET['num2'];
    $num3 = $_GET['num3'];

    if($num1 * $num2 * $num3 < 0){
        $result = $_GET['result'];
        echo "Negative";
    }
    else{
        echo "Positive";
    }

}
?>