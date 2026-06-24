# Setup Guide

## Step 1: Create GitHub Repository

Create a new repository on GitHub:

```text
leetcode-solutions
```

Do not add a README on GitHub if you are pushing this local folder first.

## Step 2: Connect Local Repo

From this folder, run:

```bash
git remote add origin https://github.com/YOUR_USERNAME/leetcode-solutions.git
git branch -M main
git push -u origin main
```

Replace `YOUR_USERNAME` with your GitHub username.

## Step 3: Install Auto Sync Extension

Install a LeetCode-to-GitHub extension such as LeetHub v2 in Chrome or Edge.

Then:

1. Open the extension.
2. Authorize GitHub.
3. Choose the `leetcode-solutions` repository.
4. Solve a LeetCode problem and submit it.
5. When accepted, the extension should automatically commit it to GitHub.

## Step 4: Check GitHub

After an accepted submission, refresh your GitHub repo and check whether a new solution file was added.

