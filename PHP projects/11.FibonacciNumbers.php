<?php
if(isset($_GET['num'])) {
    $num = intval($_GET['num']);
    if($num == 1) {
        echo 1;
    } else if($num == 2) {
        echo 1 . " " . 1 . " ";
    } else {
        echo 1 . " " . 1 . " ";
        $a = 1;
        $b = 1;

        for($i = 2; $i <$num; $i++) {
            $d = $a + $b ;
            $a = $b;
            $b = $c;

            echo $c . " ";
        }
    }
}
?>
<form>
    Number: <input type="text" name="num"/>
    <input type="submit" name="result"/>
</form>
