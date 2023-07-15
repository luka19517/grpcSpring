import { createRouter, createWebHistory } from 'vue-router';

export const router = createRouter({
    history: createWebHistory(),
    routes: [
        { path: '/test', component: () => import('./components/CustomComponent.vue') },
    ]
})