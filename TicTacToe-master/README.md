[![Build Status](https://magnum.travis-ci.com/LogiGudmann/TicTacToe.svg?token=7XFxtsfHskBb63iWuLSn&branch=master)](https://magnum.travis-ci.com/LogiGudmann/TicTacToe)
# TicTacToe

We made sure that the process of setting up the application and running it for the first time would be as easy as possible. Simply follow the instructions below.

### Setting up Git
Git is necassary to be able to clone our project onto your machine. If you haven't already set up Git, you can find the installation instructions [here](https://goo.gl/Xy3rLy "Git setup").


### Cloning the repository
Run the following command in your command line to clone our repository:
```
git clone https://github.com/LogiGudmann/TicTacToe.git
```

### Setting up Java
If Java isn't already set up on your machine, run the following command:
```
sudo apt-get install openjdk-8-jdk
```

### Running the program
Make sure that you're located at the root of our project. Then run this command for ConsoleUI: `./bin/deploy console`, or this command for WebUI: `./bin/deploy web`.

If you've already built the project, you can run the current build by executing `./bin/playCurrentBuild`.

If you choose the WebUI, open your browser and type in: `http://localhost:4567/`.

To make the server run on another port (the default is 4567), run the following command: 
`set PORT=1337` (Windows) or `export PORT=1234` (other).




### Have fun!
Try out our game! Enjoy Player vs. Player where you and your friends can play against each other. Make sure you try out both the ConsoleUI as well as the WebUI.




