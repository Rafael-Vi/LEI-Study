import { defineConfig } from 'vite';
import denoPlugin from '@deno/vite-plugin';

export default defineConfig({
  plugins: [denoPlugin()],
  // Your Vite configuration here
});