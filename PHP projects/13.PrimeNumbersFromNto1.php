<form>
    Number: <input type="text" name="num"/>
    <input type="submit" name="result"/>
</form>

<?php

if (isset($_GET['num'])) {
    $num = intval($_GET['num']);
    for ($i = $num; $i >= 1; $i--) {
        $prime = true;
        for ($b = 2; $b <= floor(sqrt($i)); $b++) {

            if ($i % $b == 0) {
                $prime = false;
                break;
            }
        }
        if($prime){
            echo "$i ";
        }
    }
}
?>