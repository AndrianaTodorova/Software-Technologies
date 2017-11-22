<form>
    N: <input type="text" name="num1"/>
    M: <input type="text" name="num2"/>
    <input type="submit">
</form>

<?php
if(isset($_GET['num1']) && isset($_GET['num2']) && $_GET['num1'] <= $_GET['num2']){
    $num1 = intval($_GET['num1']);
    $num2 = intval($_GET['num2']);
    echo $num1 * $num2;
}
else if(isset($_GET['num1']) && isset($_GET['num2']) && $_GET['num1'] > $_GET['num2']){
    $num1 = intval($_GET['num1']);
    $num2 = intval($_GET['num2']);
    echo $num1 / $num2;
}
?>