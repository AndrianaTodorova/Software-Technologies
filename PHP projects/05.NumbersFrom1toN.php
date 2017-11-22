<form>
    Number: <input type="text" name="num"/>
    <input type="submit" name="result"/>
</form>

<?php
if(isset($_GET['num'])){
    $num1 = intval($_GET['num']);
    for($i = 1;$i <= $num1; $i++){
        $result = $_GET['result'];
        $result = $i;
        echo "$i ";
    }
}
?>