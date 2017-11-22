<?php
$msAfterCelsius=" ";
if(isset($_GET['cel'])){
    $cel = floatval($_GET['cel']);
    $fah = $cel * 1.8 + 32;
    $msAfterCelsius = "$cel &deg;C = $fah &deg;F";
}
$msAfterFahrenheit = " ";
if(isset($_GET['fah'])){
    $fah = floatval(($_GET['fah']));
    $cel = ($fah - 32)/1.8;
    $msAfterFahrenheit = "$fah &deg;F = $cel &deg;C";
}
?>
<form>
    Celsius: <input type="text" name="cel"/>
    <input type="submit" value="Convert"/>
    <?= $msAfterCelsius ?>

</form>
<form>
    Fahrenheit: <input type="text" name="far"/>
    <input type="submit" value="Convert"/>
    <?= $msAfterFahrenheit ?>
</form>