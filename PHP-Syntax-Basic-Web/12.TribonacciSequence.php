<?php
if(isset($_GET['num'])) {
    $num = intval($_GET['num']);
    if($num == 1) {
        echo 1;
    } else if($num == 2) {
        echo 1 . " " . 1 . " ";

    }
    elseif($num == 3){
        echo 1 . " " . 1 . " " . 2 ;
    }
    else {
        echo 1 . " " . 1 . " " . 2 . " ";
        $a = 1;
        $b = 1;
        $c = 2;
        for($i = 3; $i <$num; $i++) {
            $d = $a + $b + $c;
            $a = $b;
            $b = $c;
            $c = $d;
            echo $d . " ";
        }
    }
}
?>
<form>
    Number: <input type="text" name="num"/>
    <input type="submit" name="result"/>
</form>
