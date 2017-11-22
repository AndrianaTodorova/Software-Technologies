<form>
    Num: <input type="text" name="num1"/>
    <input type="submit" />
</form>

<?php
if(isset($_GET['num'])){
    $num1 = intval($_GET['num']);

    for ($i = 1; $i <= $num1; $i++){
        echo "<button>$i</button>\n";
    }
}
?>