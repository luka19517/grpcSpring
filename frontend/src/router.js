import { createRouter, createWebHistory } from 'vue-router'

var router = createRouter({
  history: createWebHistory(),
  routes: [
    { path: '/', component: () => import('./components/CustomComponent.vue') }
  ]
})

export default router

