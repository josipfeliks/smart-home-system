FROM node:14-alpine
# Add a work directory
WORKDIR /app
# Cache and Install dependencies
COPY package.json /app/
COPY package-lock.json /app/
RUN npm install
# Copy app files
COPY . /app/