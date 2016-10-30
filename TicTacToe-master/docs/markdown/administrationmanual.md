# **Administration manual**
This manual will come in handy if you'd like to contribute any code or changes to this project.

### Get the project to build
For clear information about how to get this project up and running, check out the development manual.

### Check out to a new branch
In order to keep the project safe and uncluttered, it is necessary to work on new features/changes on new branches. To create and check out to a new branch, run the following command: `git checkout -b nameOfNewBranch`

### Make your changes
After making your changes, make sure that the program passes all tests and runs as wanted. Instructions can be found in the development manual. Then push your changes to your new branch: `git push origin nameOfNewBranch`


### Merge your branch with master
If Travis is pleased, the next step is to merge your new branch with the master branch. To do so, run the following commands:

```
git checkout master
git pull origin master
```
By now you have pulled the latest changes from master. If there are any conflicts, solve them. Else, run the following commands:

```
git merge nameOfNewBranch
git push origin master
```

Voilà! Your new changes are up and running :)