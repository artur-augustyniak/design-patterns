<?php

interface Vehicle
{
    public function start();

    public function stop();

}


class EngineVehicle implements Vehicle
{


    public function start()
    {
        echo "Active start\n";
    }

    public function stop()
    {
        echo "Active stop\n";
    }
}

class PassiveVehicle implements Vehicle
{

    public function start()
    {
        $this->stop();
    }

    public function stop()
    {
        echo "Passive stop\n";
    }
}


class Bundle implements Vehicle
{

    private $vehicles = array();


    public function addVehicle(Vehicle $v)
    {
        $this->vehicles[] = $v;
        return $this;
    }


    public function start()
    {
        foreach ($this->vehicles as $v) {
            $v->start();
        }
    }

    public function stop()
    {
        foreach ($this->vehicles as $v) {
            $v->stop();
        }
    }
}


function driveMad(Vehicle $v)
{
    $v->start();
    $v->stop();
    $v->start();
    $v->stop();
    $v->start();
    $v->stop();
}


$wagon = new PassiveVehicle();
$trup = new PassiveVehicle();
$lokomotywa = new EngineVehicle();
$pociąg = new Bundle();
$pociąg->addVehicle($lokomotywa)->addVehicle($wagon)->addVehicle($trup);

$pociąg2 = new Bundle();
$pociąg2->addVehicle($pociąg);


driveMad($pociąg);
driveMad($trup);
