package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.subsystems.elevator.Elevator;
import frc.robot.subsystems.elevator.ElevatorPosition;

public class ElevatorCommands {

  public static Command elevatorMove(Elevator elevator, ElevatorPosition position) {
    return Commands.run(
        () -> {
          //

        });
  }
}
