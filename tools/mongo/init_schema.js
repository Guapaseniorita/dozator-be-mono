db = db.getSiblingDB('dozator')

db.createUser({
  user: 'dozator',
  pwd: 'secret',
  roles: [
    { role: 'readWrite', db: 'dozator' },
  ],
})